p
If the
.Cm l
(ell) modifier is used, the
.Vt "wchar_t *"
argument is expected to be a pointer to an array of wide characters
(pointer to a wide string).
For each wide character in the string, the (potentially multi-byte)
sequence representing the
wide character is written, including any shift sequences.
If any shift sequence is used, the shift state is also restored
to the original state after the string.
Wide characters from the array are written up to (but not including)
a terminating wide
.Dv NUL
character;
if a precision is specified, no more than the number of bytes specified are
written (including shift sequences).
Partial characters are never written.
If a precision is given, no null character
need be present; if the precision is not specified, or is greater than
the number of bytes required to render the multibyte representation of
the string, the array must contain a terminating wide
.Dv NUL
character.
.It Cm p
The
.Vt "void *"
pointer argument is printed in hexadecimal (as if by
.Ql %#x
or
.Ql %#lx ) .
.It Cm n
The number of characters written so far is stored into the
integer indicated by the
.Vt "int *"
(or variant) pointer argument.
No argument is converted.
.It Cm %
A
.Ql %
is written.
No argument is converted.
The complete conversion specification is
.Ql %% .
.El
.Pp
The decimal point
character is defined in the program's locale (category
.Dv LC_NUMERIC ) .
.Pp
In no case does a non-existent or small field width cause truncation of
a numeric field; if the result of a conversion is wider than the field
width, the
field is expanded to contain the conversion result.
.Sh RETURN VALUES
These functions return
the number of characters printed, or that would be printed if there
was adequate space in case of
.Fn snprintf ,
.Fn vsnprintf ,
and
.Fn vsnprintf_ss
(not including the trailing
.Ql \e0
used to end output to strings).
If an output error was encountered, these functions shall return a
negative value.
.Sh EXAMPLES
To print a date and time in the form
.Dq Li "Sunday, July 3, 10:02" ,
where
.Fa weekday
and
.Fa month
are pointers to strings:
.Bd -literal -offset indent
#include \*[Lt]stdio.h\*[Gt]
fprintf(stdout, "%s, %s %d, %.2d:%.2d\en",
	weekday, month, day, hour, min);
.Ed
.Pp
To print \*(Pi
to five decimal places:
.Bd -literal -offset indent
#include \*[Lt]math.h\*[Gt]
#include \*[Lt]stdio.h\*[Gt]
fprintf(stdout, "pi = %.5f\en", 4 * atan(1.0));
.Ed
.Pp
To allocate a 128 byte string and print into it:
.Bd -literal -offset indent
#include \*[Lt]stdio.h\*[Gt]
#include \*[Lt]stdlib.h\*[Gt]
#