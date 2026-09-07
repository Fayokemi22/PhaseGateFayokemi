class MovieRateSystem:

    def add_movie(movie_name):
        movies = []
 
        if movie_name in movies:
            return f"{movie_name} is already in the list."
        movies.append(movie_name)
        return f"Movie {movie_name} Added"

    def rate_movie(movie_name, rating):
        movies = []
        ratings = []
        if movie_name not in  movies:
            return f"{movie_name} hasn't been added yet."
        ratings.append(rating)
        return f"Rated {movie_name} {rating}"
 

#movies = []
#ratings = []
#
#def add_movie(movie_name):
#    if movie_name in movies:
#        return f"{movie_name} is already in the list."
#    movies.append(movie_name)
#    return f"Movie {movie_name} Added"
#
#def rate_movie(movie_name, rating):
#    if movie_name not in movies:
#        return f"{movie_name} hasn't been added yet."
#    ratings.append(rating)
#    return f"Rated {movie_name} {rating}"
#
#def main():
#    is_running = True
#    while is_running:
#        menu = """
#           1. Add a movie
#           2. Rate a movie
#           3. View average 
#           4. Exit
#           """
#        print(menu)
#
#        choice = int(input("Enter your choice "))
#        match choice:
#            case 1:
#                movie_name = input("Enter your movie name")
#                print(add_movie(movie_name))
#            case 2:
#                movie_name = input("Enter your movie name :")
#                rating = float(input("Enter rating: "))
#                print(rate_movie(movie_name, rating))
#
#            case 3:
#                for rate in ratings:
#                    print(f" All Ratings :\n {rate} ")
#
#            case 4:
#                is_running = False
#                print("Exiting...")
#
#            case _:
#                print("Invalid Input")
#
#main()
