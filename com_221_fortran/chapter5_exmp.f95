! This program calculates the velocity from the
! acceleration and time.

program findvelocity

      ! since, we do not want the compiler to imply any data values
      implicit none

      ! Declare variable
      real :: velocity, acceleration = 128.0
      real :: time = 8.0

      ! Display initial header or message
      write (*,*) "Velocity Calculation Program"
      write (*,*)

      ! Calculate the velocity
      velocity = acceleration * time

      ! Display the result
      write (*,*) "Velocity = ", velocity

end program findvelocity      
