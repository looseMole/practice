import static java.util.Arrays.copyOfRange;

public class DayOne extends Day{
    int[] tableToSearch;
    public int chop(int target, int[] tableToSearch) {
        int middleIndex;
        this.tableToSearch = tableToSearch;

        while(this.tableToSearch.length >= 1){
            if(tableToSearch.length % 2 == 0) {
                middleIndex = this.tableToSearch.length/2;
            } else {
                middleIndex = this.tableToSearch.length/2;
                System.out.println(middleIndex);
            }


            if(this.tableToSearch.length == 1) {
                if(this.tableToSearch[0] == target) { // TODO: Correct this. You cannot alter the length of the array, then return an index number of that array in a bin search.
                    return 0; // The index of the only number left.
                } else {
                    return -1;
                }
            }

            else if(this.tableToSearch[middleIndex] == target){
                return middleIndex;
            }

            else if (this.tableToSearch[middleIndex] < target) {
                this.tableToSearch = copyOfRange(this.tableToSearch, middleIndex + 1, this.tableToSearch.length);
            }

            else if (this.tableToSearch[middleIndex] > target) {
                this.tableToSearch = copyOfRange(this.tableToSearch, 0, middleIndex);
            }

        }

        return -1; // To indicate the number could not be found.
    }
}
