! this is the example program to explain the concept of
! input         -       read(*,*)
! and output    -       write(*,*)
! in fortran

program circle
      ! Program to calculate area of a circle

      implicit none     
      ! implicit feature is turned off to prevent the
      !compiler from implying value during compiling process

      
      ! Declare Variables
      real :: radius, diameter, area
      real, parameter :: pi = 3.14159


      ! Display initial header and blank line
      write(*,*) "Circle Area Calculation Program"
      write(*,*)


      ! Prompt for and read the radius
      write(*,*) "Enter a diameter number"
      read(*,*) diameter
      
      ! Convert the inputted diameter into radius
      write(*,*) "Converting the diameter into radius..."
      radius = diameter / 2
      write(*,*) "Converted value is", radius

      ! Calculate the circle area
      area = pi * radius**2


      ! Display result
      write(*,*) "The area of the circle is", area


end program circle      
