using System;
using static System.Console;

namespace StringInterpolation
{
    class MainApp
    {
        static void Main(string[] args)
        {
            string name = "송주호";
            int age = 26;
            WriteLine($"{name,-10}, {age:D3}");

            name = "씨샵";
            age = 20;
            WriteLine($"{name}, {age,-10:D3}");

            name = "씨언어";
            age = 17;
            WriteLine($"{name}, {(age > 20 ? "성인" : "미성년자")}");
        }
    }
}