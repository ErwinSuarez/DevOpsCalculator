class Calculator {

    public double multiply(double x, double y){
        if((x==0) || (y==0)){
            return 0;
        }
        else{
            return x*y;
        }
    }

    public double divide(double x, double y){
        if(x==0){
            return 0;
        }
        else{
            double div = 0;
            try{
                div = x/y;
            }catch (ArithmeticException e){
                System.out.println("ArithmeticException occured!");
            }
            return div;
        }
    }

    public double addition(double x, double y){
        return x+y;
    }

    public double subtraction(double x, double y){
        return x-y;
    }

}
