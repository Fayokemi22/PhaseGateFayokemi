import unittest
from movie_rate_system import MovieRateSystem
class MovieRateTest (unittest.TestCase):
	
	def test_add_movie(self):
		movies = MovieRateSystem
		movie_name = "iron man"

		actual = movies.add_movie(movie_name)
		expected = f"Movie {movie_name} Added"

		self.assertEqual(actual, expected)
 

	def test_rate_movie(self):
		movies = MovieRateSystem
		movie_name = "iron man"
		movies.add_movie(movie_name)

		actual = movies.rate_movie("iron man",8.0)
		expected = f"{movie_name} hasn't been added yet."
 

		self.assertEqual(actual, expected)
 


