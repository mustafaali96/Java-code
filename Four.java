public class Four {
        int a;
        int b;
        int c;
        int d;

        Four(int num1,int num2,int num3,int num4) {
            this.a=num1;
            this.b=num2;
            this.c=num3;
            this.d=num4;

        }

        int Smallest()
        {
            int min=(this.a<this.b)?this.a:this.b;
            min=(min<this.c)?min:this.c;
            min=(min<this.d)?min:this.d;
            return min;
        }
        int Largest()
        {
            int max=(this.a>this.b)?this.a:this.b;
            max=(max>this.c)?max:this.c;
            max=(max>this.d)?max:this.d;
            return max;
        }
        int total()
        {
            return this.a+this.b+this.c+this.d;
        }
    }
