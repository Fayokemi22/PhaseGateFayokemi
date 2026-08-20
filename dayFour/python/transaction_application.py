import unittest
from Application import Application


class ApplicationTest(unittest.TestCase):
	def test_for_application(self):

		application_app = Application()
			
		initial_deposit = 0
	
		deposit = 500
		withdraw = 200
		
		actual = application_app.the_app(self,initialDeposit,deposit,withdraw)
		
		expected = 1300
		self.assertEqual(actual,expected)
		
		
		
		import unittest
from Sums import Sum


class SumTest(unittest.TestCase):
	def test_that_number_sum(self):
	
		sum_of_number = Sum()
			
		first_number = 78	
	
		second_number = 23
		
		actual = sum_of_number.sum_numbers(first_number,second_number)
		
		expected = 101
		
		self.assertEqual(actual,expected)
		

		


