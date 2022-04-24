#include<stdio.h>
#include<stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include<stdlib.h>
#include<sys/wait.h>
int main()
{
	int pid,pid1,j;
	pid=fork();
	if(pid==0)
	{
		sleep(5);
		pid1=getpid();
		printf("\n id of child=%d",pid1);
		j=getppid();
		printf("\n parent id= %d",j);
		printf("\n i am in child process");
	}
	else
	{
		pid1=getpid();
		printf("\n id of parent=%d",pid1);
		printf("\n i am in parent process");
	}
}
