! Below is example program in chapter4
! Chapter4 excercise requires that, one's name 
! should be added to be displayed along with the out of the program.

! this program depicts how variable and constant are declared, with or
! without initialization.

program example1
      
      implicit none
      integer :: radius, diameter
      integer :: height = 100, width = 150
      real :: area, parameter
      real :: length = 123.5, distance = 413.761
      real, parameter :: pi = 3.14159
      character(11) :: msg = "Hello World!"
      character(5) :: my_name = "Azeez"

      ! Write an output
      write (*,*) "Greeting: ", msg
      write (*,*) "Author's name: ", my_name

end program example1
