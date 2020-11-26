! Below is example program in chapter4
! Chapter4 excercise requires that, one's name 
! should be added to be displayed along with the out of the program.

! this program depicts how variable and constant are declared, with or
! without initialization.

program example1
      
      implicit none
      integer :: radius, diameter                       ! integers variables that are only declared
      integer :: height = 100, width = 150              ! integer variables that are declared and initialized
      real :: area, parameter                           ! real variables that are only declared
      real :: length = 123.5, distance = 413.761        ! real variables that are declared and initialized
      real, parameter :: pi = 3.14159                   ! real constant that is declared and initialized
      character(11) :: msg = "Hello World!"             ! string variable whose length must not exceed 11
      character(5) :: my_name = "Azeez"                 ! another string variable whose length must not exceed 5

      ! Write an output
      write (*,*) "Greeting: ", msg
      write (*,*) "Author's name: ", my_name

end program example1
