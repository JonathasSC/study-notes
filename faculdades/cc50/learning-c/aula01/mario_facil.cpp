#include <iostream>

using namespace std;

int main()
{

    int height;
    int cubes = 1;

    while (height < 1 || height > 8)
    {
        cout << "Digite a altura: ";
        cin >> height;
    }

    while (cubes <= height)
    {
        int spaces = height - cubes;

        for (int index = 0; index < spaces; index++)
        {
            printf(" ");
        };

        for (int index = 0; index < cubes; index++)
        {
            printf("#");
        };

        
        printf("\n");
        cubes++;
    }

    /* code */
    return 0;
}
