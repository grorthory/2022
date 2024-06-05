#include  "FPToolkit.c"

int main()
{
int Ke, n, i;
double z[2], x, y, x_values[100], y_values[100], x_total, y_total, midpoint[2], color;
color=0;

G_init_graphics(800, 800);
G_rgb (0.3, 0.3, 0.3);
G_clear () ;

G_rgb (0, 0, 1);
G_rectangle(0, 0, 20, 800);

G_rgb(1, 0, 0);

i=0;
x=800;
while (x>20){
G_wait_click(z);
x=z[0];
y=z[1];
if (x>20){
x_values[i]=x;
y_values[i]=y;
G_fill_circle(x, y, 2);
i=i+1;
}
}

n=i;
i=0;

while(i<n){
x_total=x_total+x_values[i];
y_total=y_total+y_values[i];
i=i+1;
}
midpoint[0] = x_total/i;
midpoint[1] = y_total/i;
G_fill_circle(midpoint[0], midpoint[1], 2);

i=0;
while (i+1<n){
G_rgb(1, 0, 0);
G_triangle(x_values[i], y_values[i], x_values[i+1], y_values[i+1], midpoint[0], midpoint[1]);

color=color+0.1;
G_rgb(1, color, color);
G_fill_triangle(x_values[i], y_values[i], x_values[i+1], y_values[i+1], midpoint[0], midpoint[1]);
i=i+1;
}
G_rgb(1, 0, 0);
G_triangle(x_values[i], y_values[i], x_values[0], y_values[0], midpoint[0], midpoint[1]);
color=color+0.1;
G_rgb(1, color, color);
G_fill_triangle(x_values[i], y_values[i], x_values[0], y_values[0], midpoint[0], midpoint[1]);

Ke = G_wait_key();
}
