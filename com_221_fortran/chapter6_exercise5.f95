! This is the tast given on excercise number 5 on page 35 of fortran
! eBook, used in ND2 second semester in yabatech

program geometric
      
      ! Declare the needed variables
      real :: length_a, length_c, length_p
      real :: length_q


      ! Obtain the value for length_a, length_c & length_p
      write(*,*) "What is the length of side a"
      read(*,*) length_a

      write(*,*) "What is the length of side c"
      read(*,*) length_c

      write(*,*) "What is the length of the side p"
      read(*,*) length_p


      ! Calculate for value of length_q
      length_q = sqrt(length_a**2 - (length_p**2 / 4)) + sqrt(length_c**2 - (length_p**2 / 4))


      ! Display the value of all the 4 lengths
      write(*,*) "Length 'a' is", length_a
      write(*,*) "Length 'c' is", length_c
      write(*,*) "Length 'p' is", length_p
      write(*,*) "Length 'q' is", length_q


end program geometric      
