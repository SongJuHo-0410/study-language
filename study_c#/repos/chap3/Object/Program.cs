﻿using System;

namespace Object
{
    class Program
    {
        static void Main(string[] args)
        {
            object a = 123;
            object b = 3.14159265324234234234234234234m;
            object c = true;
            object d = "안녕하세요.";

            Console.WriteLine(a);
            Console.WriteLine(b);
            Console.WriteLine(c);
            Console.WriteLine(d);
        }
    }
}