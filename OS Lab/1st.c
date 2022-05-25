 #include <unistd.h>
#include <fcntl.h>              /* Obtain O_* constant definitions */
#include <unistd.h>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
	int x,fd[2],j;
	x=pipe(fd);
	if(x==0)
	{
		j=fork();
		if(j==0)
		{
			char buf[10];
			read(fd[0],buf,5);
			printf("\n %s",buf);
		}
		else
		{
			char buf1[10];
			printf("\n enter the data");
			scanf("%s",buf1);
			write(fd[1],buf1,strlen(buf1));
		}
	}
	else
	{
		printf("\n pipe not created");
		exit(0);
	}
	return 0;
}
