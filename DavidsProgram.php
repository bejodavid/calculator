<?php
print("Hello welcome to Davids calculator.We dont have alott yet because  this is the beta 0.0.0.0.1. and sorry for gliches this program is being made by a 9 year old. \n");
print("press 1 to go to the calculator press 2 to see the release scedule\n");
$A = trim(fgets(STDIN));
if ($A == 2) {
    print("Welcome to the release scedule.  \n");
    print("0.0.0.0.1, 2019.july.26\n");
    print("0.0.0.0.2, 2019.july.28\n");
    print("0.0.0.0.3, 2019.july.29\n");
    print("0.0.0.0.4, 2019.july.31\n");
}
;
if ($A == 1) {
    print("Welcome to the calculator. For now you can only +,-,/ and * but if you want to know when you can calculate more complex eqasions chek the realise schedule\n");
    print("Press 2 for +,-,* or /\n");
    print("New: you can press 1 for advanced calculator options.\n");

    $N = trim(fgets(STDIN));
    if ($N == 2) {
        $B = trim(fgets(STDIN));
        if ($B == "-") {
            print("Now pick two numbers and then the computer will do the rest. \n");
            $E = trim(fgets(STDIN));
            $F = trim(fgets(STDIN));
            print(($E - $F) . "\n");
        }

        if ($B == "+") {
            print("Now pick two numbers and then the computer will do the rest. \n");
            $J = trim(fgets(STDIN));
            $G = trim(fgets(STDIN));
            print(($J + $G) . "\n");
        }

        if ($B == "*") {
            print("Now pick two numbers and then the computer will do the rest. \n");
            $H = trim(fgets(STDIN));
            $I = trim(fgets(STDIN));
            print(($I * $H) . "\n");
        }
        ;
        if ($B == "/") {
            print("Now pick two numbers and then the computer will do the rest. \n");
            $L = trim(fgets(STDIN));
            $M = trim(fgets(STDIN));
            print(($L / $M) . "\n");
        }
    }
    if ($N == 1) {
        print("Welcome to the advanced calculator for now you can only get:Speed,distance and time\n");
        print("Now press: 1 for speed, 2 for distance, 3 for time\n");
        $K = trim(fgets(STDIN));
        if ($K == 1) {
            print("Ok now give me the distance via Km and time via h and I will right the speed via Km/h\n");
            $P = trim(fgets(STDIN));
            $Q = trim(fgets(STDIN));
            $R = $P / $Q;
            if ($Q < 60) {
                // TODO
            }

            /*
             * S
             * T
             * U
             * V
             * W
             * X
             * Y
             * Z
             */
        }
        ;
    }
    ;
}

?>