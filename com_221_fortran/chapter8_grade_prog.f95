program grade_scores
        IMPLICIT NONE
        ! Declare Variables
        ! reals -> test1, test2, test3
        real :: test1_score, test2_score, test3_score
        ! integer -> testave
        integer :: test_average
        ! Display initial header
        write(*,*) "Check your grade of your scores"
        write(*,*)

        ! Read value for each of the 3 test scores
        Write(*,*) "What is your score in COM221? "
        read(*,*) test1_score

        Write(*,*) "What is your score in COM121? "
        read(*,*) test2_score

        Write(*,*) "What is your score in COM124? "
        read(*,*) test3_score

        ! Calculate the test average and conver result to integer
        test_average = nint((test1_score + test2_score + test3_score) &
                / 3)
        ! Determine the grade
        ! A - >= 90
        ! B - 80 to 89
        ! C - 70 to 79
        ! D - 60 to 69
        ! F - <= 59

        select case(test_average)
        case(90:)
                write(*,*) "Your grade is: A"
        case(80:89)
                write(*,*) "Your grade is: B"
        case(70:79)
                write(*,*) "Your grade is: C"
        case(60:69)
                write(*,*) "Your grade is: D"
        case(:59)
                write(*,*) "Your grade is: F"
        end select

end program grade_scores

