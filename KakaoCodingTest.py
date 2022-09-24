def solution(today,terms,privacies):
    
    answer = []
    year_month_date = today.split('.')
    year = int(year_month_date[0])
    month = int(year_month_date[1])
    day = int(year_month_date[2])
    today_in_days = (336*year)+(28*month)+day
    
    term_types = {}
    for term in terms:
        term_break = term.split(' ')
        term_name = term_break[0]
        term_length = int(term_break[1])
        term_types[term_name] = term_length
    
    current_index = 1
    for privacy in privacies:
        privacy_contract = privacy[11:]
        privacy_year_month_date = privacy[:10]
        privacy_year_month_break = privacy_year_month_date.split('.')
        privacy_year = int(privacy_year_month_break[0])
        privacy_month = int(privacy_year_month_break[1])
        privacy_date = int(privacy_year_month_break[2])
        expire_in_days = (336*privacy_year)+(28*privacy_month)+privacy_date+(28*term_types[privacy_contract])
        
        if(today_in_days>=expire_in_days):
           answer.append(current_index)
        
        current_index+=1
     
    
    return answer

print(solution("2022.05.16",["A 1"],["2021.05.01 A"])) #output: [1]

