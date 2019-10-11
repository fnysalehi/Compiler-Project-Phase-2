#include <stdio.h>

int main() {
	// ////////////////// Symbol Table \\\\\\\\\\\\\\\\\\ \\

	int __SHLangTempVar0;
	int __SHLangTempVar1;
	int __SHLangTempVar2;
	int __SHLangTempVar3;

	// ////////////////// Quadruples \\\\\\\\\\\\\\\\\\ \\

Line0:		__SHLangTempVar0 = 8;
Line1:		if (__SHLangTempVar0) goto Line3;
Line2:		goto Line3;
Line3:		__SHLangTempVar1 = 0;
Line4:		if (__SHLangTempVar1) goto Line6;
Line5:		goto Line6;
Line6:		__SHLangTempVar2 = 10;
Line7:		if (__SHLangTempVar2) goto Line9;
Line8:		goto Line9;
Line9:		null
Line10:		__SHLangTempVar3 = 0;
Line11:		if (__SHLangTempVar3) goto Line13;
Line12:		goto Line13;
Line13:		null
Line14:		printf("Process is terminated with no error.\n");
				getchar();
				return 0;
Line15:		printf("Array Error: Index out of bound!\n");
				getchar();
			return -1;
Line16:		printf("Array Error: Invalid array size!\n");
				getchar();
			return -2;
}
