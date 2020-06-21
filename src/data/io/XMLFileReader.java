you recover the original uncompressed data.
You can use
.Nm bzip2recover
to try to recover data from
damaged files.
.Sh OPTIONS
.Bl -tag -width "XXrepetitiveXfastXX"
.It Fl Fl
Treats all subsequent arguments as file names, even if they start with
a dash.
This is so you can handle files with names beginning with a dash, for
example:
.Dl bzip2 -- -myfilename .
.It Fl 1 , Fl Fl fast
to
.It Fl 9 , Fl Fl best
Set the block size to 100 k, 200 k ... 900 k when compressing.
Has no effect when decompressing.
See
.Sx MEMORY MANAGEMENT
below.
The
.Fl Fl fast
and
.Fl Fl best
aliases are primarily for GNU
.Xr gzip 1
compatibility.
In particular,
.Fl Fl fast
doesn't make things significantly faster, and
.Fl Fl best
merely selects the default behaviour.
.It Fl c , Fl Fl stdout
Compress or decompress to standard output.
.It Fl d , Fl Fl decompress
Force decompression.
.Nm bzip2 ,
.Nm bunzip2 ,
and
.Nm bzcat
are really the same program, and the decision about what actions to
take is done on the basis of which name is used.
This flag overrides that mechanism, and forces
.Nm bzip2
to decompress.
.It Fl 