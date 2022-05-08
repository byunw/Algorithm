
row=1
col=1

pebbleNum=int(input())

while((row*col)<pebbleNum):
  
  if(row<col): row+=1 
    
  elif(row==col): row+=1    
  
  elif(row>col): col+=1

print(row,col)

  
  
  
  






