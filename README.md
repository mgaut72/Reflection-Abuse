Reflection Abuse
=================

Its amazing what you can do with the builtin reflection tools of Java.

Have a private field that you need access to? just reflect on it!

Want to get a private method, and run it? just reflect on it!

Note that this is just a demonstration of what you can do with reflection, not what you should do
with it.  Generally, reflection is useful as a last resort for unit testings and the like, with its real
use in loading classes by the JVM


[Corresponding Slides](https://docs.google.com/presentation/d/1d7lAp8k_wYZrKav20GYPSTo21lv00KAOhwUmGwg_7nc/edit#slide=id.p)



usage:
---------

javac *.java


####java GetClass_Ex

This class demonstrate what objects know about themselves and their types

####java Inspect

This class will use reflection to access the private methods and fields of the SuperSecret class

####java Map_Ex

This class creates a map method, that takes a function name, and a list, and maps that function over the list
The function name is given as a string, and we use reflection to get that method and invoke it
