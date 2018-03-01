
class Modular
{
public static long modular(long x, long y, long N) 
{
    if(y == 0)
        return 1;

    long z = modular(x, Math.abs(y/2), N);

    if(y % 2 == 0)

    return (long) ((Math.pow(z, 2)) % N);
    return (long) ((x * Math.pow(z, 2)) % N);
}
public static void main(String args[])
{
	long mod=modular(48,103,143);
	System.out.println(mod);
}
}