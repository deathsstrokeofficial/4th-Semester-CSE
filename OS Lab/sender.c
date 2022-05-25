#include <sys/types.h>
#include <sys/stat.h>
#include<stdio.h>
#include <sys/stat.h>
#include <fcntl.h>
 #include <unistd.h>
#include<string.h>
int main()
{
	int x,f;
	char *ch="/tmp/myte",buf[15];
	printf("\n enter your data");
	scanf("%s",buf);
	x=mkfifo(ch,0666);
	if(x==0)
	{
		f=open(ch,O_WRONLY);
		write(f,buf,strlen(buf)+1);
	}
	return 0;
}
