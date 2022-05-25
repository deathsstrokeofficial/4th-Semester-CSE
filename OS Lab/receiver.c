#include <sys/types.h>
#include <sys/stat.h>
#include<stdio.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>

int main()
{
	int x,f;
	char *ch="/tmp/myte",buf[15];
	f=open(ch,O_RDONLY);
	read(f,buf,15);
	printf("\n %s",buf);
	return 0;
}
