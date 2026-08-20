import unittest
from Application import Application


class ApplicationTest(unittest.TestCase):
	def test_for_application(self):

		application_app = Application()
			
		initial_deposit = 0
	
		deposit = 500
		withdraw = 200
		
		actual = application_app.the_app(self,initialDeposit,deposit,withdraw)
		
		expected = 300
		self.assertEqual(actual,expected)
		
		
		
		


