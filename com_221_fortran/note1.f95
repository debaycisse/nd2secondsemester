! The below program is not solving any problem per se, it is only used
! to show how the following are declared, each declaration is explained.

program keynote_taking
      
      ! to turn off implicit program compiling mode
      implicit none


      ! to declare variable without any value initialization
      integer :: radius
      real :: radiu2
      real :: area, perimeter
      integer :: radius, diameter


      ! to declare variable with value - initialization
      integer :: width = 150, height = 100
      real :: length = 123.5, distance = 413.761


      ! to declare constant
      real, parameter :: pi = 3.14159



      ! to declare set of characters (string)
      character(11) :: my_name = "azeez"
      ! character(11) will only take a set of characters of NOT MORE
      ! THAN 11 characters


      ! to display or print on the screen
      write (*,*) "display this on the screen.", my_name
   

end program keynote_taking
