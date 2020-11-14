! This Program calculates Quadratic Equation
! To use it, run it and give the value for A, B and C variables

program quadratic
        IMPLICIT NONE
        ! Declare variables
        ! real -> A, B, C, discriminant, root1, root2
        real :: A, B, C
        real :: discriminant, root1, root2

        ! Display initial header
        write(*,*) "Quadratic Equation Solver Program"

        ! Fetch the value for A, B and C variables
        write(*,*) "Type in the value for A"
        read(*,*) A
        write(*,*) "Type in the value for B"
        read(*,*) B
        write(*,*) "Type in the value for C"
        read(*,*) C

        ! Calculate the discriminant
        discriminant = B**2 - 4.0*A*C

        ! Flow Control
        ! If discriminant is 0, calculate and display root
        if(discriminant == 0) then
                root1 = -B / (2.0 * A)
                write(*,*) "Your equation has one root"
                write(*,*) "The root is :- ", root1
        end if

        ! If discriminant > 0
        ! Calculate and display root1 and root2
        if(discriminant > 0) then
                root1 = (-B + sqrt(discriminant)) / (2.0 * A)
                root2 = (-B - sqrt(discriminant)) / (2.0 * A)
                write(*,*) "The given equation has real roots"
                write(*,*) "Root 1 :- ", root1
                write(*,*) "Root 2 :- ", root2
        end if

        ! If dsicriminant < 0
        ! Calculate and display complex root1 and root2
        if(discriminant < 0) then
                root1 = -B / (2.0 * A)
                root2 = sqrt(abs(discriminant)) / (2.0 * A)
                write(*,*) "The given equation has complex root"
                write(*,*) "Complex root 1 :- ", root1, "+i", root2
                write(*,*) "Complex root 2 :- ", root1, "-i", root2
        end if

end program quadratic
