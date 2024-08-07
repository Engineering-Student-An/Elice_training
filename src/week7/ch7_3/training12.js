/*지시사항을 따라 작성해주세요*/
var sum = 0;
for(i=1; i<=200; i++){
    check = 0;
    for(j=i; j>=1; j--) {
        if(i%j == 0) {
            check ++;
        }
    }
    if(check==2) sum+=i;
}
document.write("1이상 200이하의 소수의 합 = " + sum);