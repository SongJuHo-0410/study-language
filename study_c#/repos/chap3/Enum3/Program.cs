﻿using System;

namespace Enum3
{
    class Program
    {
        enum DialogResult { YES = 10, NO, CANCEL, CONFRM = 50, OK }

        static void Main(string[] args)
        {
            Console.WriteLine((int)DialogResult.YES);
            Console.WriteLine((int)DialogResult.NO);
            Console.WriteLine((int)DialogResult.CANCEL);
            Console.WriteLine((int)DialogResult.CONFRM);
            Console.WriteLine((int)DialogResult.OK);
        }
    }
}
