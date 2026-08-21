public class Application{
 
public static int remainingTransaction(int initialDeposit, int deposit, int withdraw){
int depositBalance = deposit + initialDeposit;
int withdrawBalance = depositBalance - withdraw;

if (withdraw > depositBalance) {
System.out.println("withdrawal failed: insufficient funds");
return depositBalance; 

} 

else {

return withdrawBalance;
}
}
}
       
      
      
