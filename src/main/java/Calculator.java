class Calculator {
    double multiply(double x, double y){
        if((x==0) || (y==0)){ return 0; }
        else{ return x*y;}
    }
    double divide(double x, double y) throws ArithmeticException {
        if(x==0){ return 0;}
        else{ return x/y; }
    }
    double addition(double x, double y){ return x+y; }
    double subtraction(double x, double y){ return x-y; }
}
