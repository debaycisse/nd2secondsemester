program periodcalc
    implicit none
    
    ! Program to calculate period of a pendulum

    ! Variab;e declarations
    real, parameter :: gravity = 980.0, pi = 3.14159
    real :: angle, length, alpha, pendulum_period


    ! Display initial header
    write(*,*) "Pendulum period calculation program"
    write(*,*)

    ! prompt for and read the values for length and angle
    write(*,*) "Type in the value for length"
    read(*,*) length

    write(*,*) "Type in the value for angle"
    read(*,*) angle

    ! convert the value of the angle degree into radians
    alpha = angle * pi / 180.0


    ! apply the pendulum formula for the calculation
    pendulum_period = 2.0 * pi * sqrt(length / gravity) * (1.0 + 1.0/4.0 * sin(alpha/2.0)**2)

    ! Display the result
    write(*,*) "The Pendulum period for angle", angle, "and length", length, "is", pendulum_period

end program periodcalc