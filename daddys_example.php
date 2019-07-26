<?php 
print "Hello David.\n"; // always write "\n" at the end for a new line!
print "It's his simple to write a PHP program!\n\n";
print "Enter a number: ";
// this is how you read somehing from the keyboard:
$number_entered = trim(fgets(STDIN)); // variable names always start with $
if (!is_numeric($number_entered)) { // ! means "not"
    print "Hey! You should have entered a number!\n";
}
elseif ($number_entered == 0) {
    print "0 times anything is 0, dummy! :) \n";
}
else {
    $number_x2 = $number_entered * 2;
    print "The number you entered multiplied by two: $number_x2\n";
}

?>