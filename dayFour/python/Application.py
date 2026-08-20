class Application:
	def the_app(self,initial_deposit,deposit,withdraw)
		deposit_balance = deposit - initial_deposit 
        withdraw_balance = deposit_balance - withdraw
        if (withdraw > deposit_balance):
			print("withdrawal failed: insufficient funds")
			return deposit_balance
			else:
			return withdrawBalance

       
     
