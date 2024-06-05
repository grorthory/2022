/**
 * Various functions dealing with vectors and matrices.
 *
 * @author Alex Skiles
 */
class LinearAlgebra {

    /**
     * Returns the magnitude of the vector v (which may be of any length).
     * This is found by adding up the squares of all of the elements of v
     * and taking the square root of the total.
     */
    static double magnitude(double[] v) {
        double sum = 0;
        for (int i=0; i<v.length; i++) {
            sum+=(v[i])*(v[i]);
        }
        return Math.sqrt(sum);
    }

    /**
     * Returns the sum of vectors v and w. This is a vector of the same
     * length, each of whose elements is the sum of the corresponding
     * elements in v and w.
     */
    static double[] sum(double[] v, double[] w) {
        double[] sums = new double[v.length];
        for (int i=0; i<v.length; i++) {
            sums[i]=v[i]+w[i];
        }
        return sums;
    }

    /**
     * Returns the difference between vectors v and w. This is a vector
     * of the same length, each of whose elements is the difference
     * between the corresponding elements in v and w.
     */
    static double[] difference(double[] v, double[] w) {
        double[] differences = new double[v.length];
        for (int i=0; i<v.length; i++) {
            differences[i]=-1*(w[i]-v[i]);
        }
        return differences;
    }

    /**
     * Returns the element-wise between vectors v and w. This is a vector
     * of the same length, each of whose elements is the product of the
     * corresponding elements in v and w.
     */
    static double[] elementwiseProduct(double[] v, double[] w) {
        double[] products = new double[v.length];
        for (int i=0; i<v.length; i++) {
            products[i]=v[i]*w[i];
        }
        return products;
    }

    /**
     * Returns the dot product of vectors v and w. This is the sum of
     * the products of the corresponding elements.
     */
    static double dotProduct(double[] v, double[] w) {
        double sum=0;
        for (int i=0; i<v.length; i++) {
            sum+=v[i]*w[i];
        }
        return sum;
    }

    /**
     * Returns, as an array of two elements, the dimensions of matrix m.
     */
    static int[] dimensions(double[][] m) {
        int[] ans = new int[2];
        ans[0]=m.length;
        ans[1]=m[0].length;
        return ans;
    }

    /**
     * Returns the element-wise sum of matrices m and n.
     */
    static double[][] sum(double[][] m, double[][] n) {
        double[][] sums = new double[m.length][m[0].length];
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                sums[i][j]=m[i][j]+n[i][j];
            }
        }
        return sums;
    }

    /**
     * Returns the element-wise product of matrices m and n.
     */
    static double[][] elementwiseProduct(double[][] m, double[][] n) {
        double[][] products = new double[m.length][m[0].length];
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[0].length; j++){
                products[i][j]=m[i][j]*n[i][j];
            }
        }
        return products;
    }

    /**
     * Returns the transpose of m, that is, a matrix where element
     * i, j is element j, i from m.
     */
    static double[][] transpose(double[][] m) {
        double[][] transposed = new double[m[0].length][m.length];
        for (int i=0; i<m[0].length; i++){
            for (int j=0; j<m.length; j++){
                transposed[i][j]=m[j][i];
            }
        }
        return transposed;
    }

    /**
     * Returns the matrix product of m and n. (Search the web for a
     * definition.)
     */
    static double[][] product(double[][] m, double[][] n) {
        return null;
    }

}
