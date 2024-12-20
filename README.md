### CSC 349, Sample Assignments

Included are several implementations of a recursive algorithm to calculate the
n'th Fibonacci number, along with invoking shell scripts for each.

You may implement your assignments in any of the following languages:

 * C
 * Python 3
 * Java
 * Node.js (TypeScript is also installed.)
 * Clojure
 * Kotlin
 * Julia
 * Rust

To make automated grading possible, you will also need to submit two short
shell scripts: one to compile your submission, one to run it. For example, all
of the included Fibonacci implementations can be run using:

```
>$ ./compile.sh
>$ ./run.sh 12
144
```

Furthermore, for record-keeping purposes, you must submit only original source
files. Any directories, pre-compiled files, or compressed files will be ignored.
You may not use _any_ third party libraries, even if they are installed on Cal
Poly's UNIX servers. Note that your submission will not have Internet access at
runtime.

### Everything You Need to Know About Shell Scripts

Every shell script should start with a "shebang", which tells the OS how to
execute the file. To intrepret your script using Bash, which is the default
shell in this class's Linux grading environment:

```
#!/bin/sh
```

In Bash, basically every value (depending on the context in which it is
evaluated) is a string:

```
"Hello, world!"
```

In Bash, a variable is declared as follows (note the lack of spaces, which is
necessary, and the use of capitals, which is convention):

```
STR="Hello, world!"
```

In Bash, a variable is referenced by prefacing it with a dollar sign:

```
$STR
```

In Bash, a program is invoked in the same way as at the command prompt:

```
echo "Hello, world!"
```

...and variables can be used as arguments:

```
echo $STR
```

...but, to ensure that a variable's value is treated as one argument, it should
quoted (in case it evaluates to a string containing spaces):

```
echo "$STR"
```

In Bash, the command line arguments are variables numbered from 1:

```
$1, $2, $3, ...
```

...so, a Bash script to run your Python submission might look like:

```
#!/bin/sh
python3 fibonacci.py "$1"
```

...which says, "This is a Bash script. Run `fibonacci.py` through the Python
interpreter, passing it the same first argument that was passed to you."

### Everything You Don't Need to Know About Shell Scripts

<http://www.tldp.org/LDP/abs/html/index.html>
