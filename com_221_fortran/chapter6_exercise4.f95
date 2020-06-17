! This is the tast given on excercise number 4 on page 34 of fortran
! eBook, used in ND2 second semester in yabatech

program readlength
      
      ! Declare the needed variables
      real :: side_a, side_b, side_c, perimeter

      ! Obtain the side_a and side_b to calculate side_c
      write(*,*) "Enter the value for side 'a' of the triangle"
      read(*,*) side_a

      write(*,*) "Enter the value for side 'b' of the triangle"
      read(*,*) side_b


      ! calculate the value for side_c
      side_c = sqrt(side_a**2 + side_b**2)


      ! Display the value for the three sides
      write(*,*) "The value of side 'a' is", side_a
      write(*,*) "The value of side 'b' is", side_b
      write(*,*) "The value of side 'c' is", side_c


      ! Calculate the perimeter and display its value
      perimeter = side_a + side_b + side_c

      write(*,*) "The perimeter for the three sides is" &
              , perimeter

      ! the '&' is used to join statement that spans multiple lines



end program readlength      
