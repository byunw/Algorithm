

//MOVC 1 0 5 -> 0010 1  0     001 000 0101
    //           표     항상    bi  ra사용안함   

//current task: 어떤거가 4번째 비트값을 결정하지?
    //표에 나와있음 ㅋㅋ



//1=001
//                   67891011
//ADD 3 1 2 -> 0000000110010100
//RR 1 5 4 -> 1011000011011000


#include <iostream>
using namespace std;

//global variables
//this is assembler translating assembly language into machine language as output(very high-level view)
string opcode;
int rD,rA,rB;

string three_digit_binary(int n){

    string binary="";
    int number=4;

    while(true){

        //현재 숫자보다 2번째 숫자가 더크거나 같으면     
        if(n>=number){

           binary+="1";
           n-=number;
           number=number/2;
        
        }

        //2번째 숫자보다 현재숫자가 더크면 
        else{
            binary+="0";
            number=number/2;
        }

        if(binary.size()==3){
            break;
        }

    }

    return binary;


}


string four_digit_binary(int n){

    string binary="";
    int number=8;
    
    while(true){

        //현재 숫자보다 2번째 숫자가 더크거나 같으면     
        if(n>=number){

           binary+="1";
           n-=number;
           number=number/2;
        
        }

        //2번째 숫자보다 현재숫자가 더크면 
        else{
            binary+="0";
            number=number/2;
        }   

        if(binary.size()==4){
            break;
        }

    }

    return binary;


}


int main(){

    //명령어의 개수 
    int N;

    //명령어의 개수 받기 
    cin >> N;

    for(int i=1;i<=N;++i){
        
        //첫번쨰 데이터를 opcode에 저장, 2번쨰 데이터를 rD에 저장, 3번쨰 데이터를 rA에 저장, 4번째 데이터를 rB에 저장 
        cin >> opcode >> rD >> rA >> rB;

        string machine_code="";

        //opcode translation 
        if(opcode=="ADD"){
           machine_code+="00000"; 
        }

        else if(opcode=="ADDC"){
            machine_code+="00001";
        }

        else if(opcode=="SUB"){
            machine_code+="00010";
        }

        else if(opcode=="SUBC"){
            machine_code+="00011";
        }
        
        else if(opcode=="MOV"){
            machine_code+="00100";
        }

        else if(opcode=="MOVC"){
            machine_code+="00101";
        }

        else if(opcode=="AND"){
            machine_code+="00110";
        }

        else if(opcode=="ANDC"){
            machine_code+="00111";
        }
        
        else if(opcode=="OR"){
            machine_code+="01000";
        }

        else if(opcode=="ORC"){
            machine_code+="01001";
        }
        
        else if(opcode=="NOT"){
            machine_code+="01010";
        }

        else if(opcode=="MULT"){
            machine_code+="01100";
        }

        else if(opcode=="MULTC"){
            machine_code+="01101";
        }
        
        else if(opcode=="LSFTL"){
            machine_code+="01110";
        }
         
        else if(opcode=="LSFTLC"){
            machine_code+="01111";
        }
        
        else if(opcode=="LSFTR"){
            machine_code+="10000";
        }
                
        else if(opcode=="LSFTRC"){
            machine_code+="10001";
        }

        else if(opcode=="ASFTR"){
            machine_code+="10010";
        }        

        else if(opcode=="ASFTRC"){
            machine_code+="10011";
        }

        else if(opcode=="RL"){
            machine_code+="10100";
        }

        else if(opcode=="RLC"){
            machine_code+="10101";
        }
        
        else if(opcode=="RR"){
            machine_code+="10110";
        }

        else if(opcode=="RRC"){
            machine_code+="10111";
        }
        
        machine_code+="0";

        //2번쨰 데이터를 3-bit binary 바꿔야됨
            //어떻게 해야지 10진수(2번쨰 데이터)를 3bit binary로 바꿀까?
                //function 만들자 (v)


        //2번째 데이터를 이진수로 바꾼거 
        string six_to_eight=three_digit_binary(rD);


        //2번째 데이터를 이진수로 바꾼거를 machine_code에 추가 
        machine_code+=six_to_eight;

        //3번쨰 데이터 이진수로 변환해준거 
        string nine_to_eleven=three_digit_binary(rA);


        //3번쨰 데이터 이진수로 변환해준거 machine_code 값에다가 더해주기
        machine_code+=nine_to_eleven;


        //4번째 비트가 0이면
        if(machine_code[4]=='0'){

            string twelve_to_fourteen=three_digit_binary(rB);
            machine_code+=twelve_to_fourteen;
            machine_code+="0";

        }

        else if(machine_code[4]=='1'){
            string twelve_to_fifteen=four_digit_binary(rB);
            machine_code+=twelve_to_fifteen;
        }

        cout << machine_code << '\n';
             

    }





    return 0;
}