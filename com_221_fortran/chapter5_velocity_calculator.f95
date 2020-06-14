! The below is an example program that calculates the velocity based on
! acceleration and time. The program declares the appropriate variables
! and calculate the velocity

program findvelocity
      ! program to calculate the velocity from
      ! the acceleration and time.


      ! Declare variables
      real :: velocity 
      real :: acceleration =128.0
      real :: time = 8.0


      ! Display initial header
      write(*,*) "Velocity Calculator"
      write(*,*)


      ! Calculate the velocity
      velocity = acceleration * time
      write(*,*) "Velocity of time - ", time, " and acceleration - ",  &
      acceleration, " is equal to ", velocity
end program findvelocity      
