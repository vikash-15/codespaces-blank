###Do not change the code skeleton given.  Write code in the provided places alone.

def select_archer(score_list):
    final_answer=[]
    for list_ in score_list:
        arr=list_.split(',');
        temp=[]
        sum=0;
        key=arr[0]
        for j in range(1,len(arr)):
            sum+=int(arr[j]);
            if sum>=50:
                temp=arr[1:j+1]
                ans={key:temp}
                final_answer.append(ans);
                break;
    print(final_answer)
    return final_answer;
    
    
    



def extract_id(selected_list):
    
    ans=[]
    for i in selected_list:
        for key in i:
            ans.append(key)
        
    return ans;
                
  
        


def main():
    archers_score=[]
    no=int(input("Enter the no of archers:\n"))
    print("Enter the archer id and 10 scores of round1 as comma separated values:\n")
    for i in range(no):
        archers_score.append(input())
    select_list=select_archer(archers_score)
    
    ids=extract_id(select_list)
    if ids:
        print("Selected archers' IDs:")
        for id in ids:
            print(id)
    else:
        print("No archers were selected.")
        
    return select_list


    
if __name__=='__main__':
    main() 