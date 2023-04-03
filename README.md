# business-analyzer

The BusinessAnalyzer method reads and processes the CSV file by iterating over each line and adds each business to the businessesList. It also initializes the historyList. This approach has an O time complexity (n). 
The run method is a loop that reads user's input, which the running time can varies.
The processInput method will call one of these four methods: handleZipCommand, handleNaicsCommand, handleSummaryCommand, or handleHistoryCommand. The  time complexity is O(1).
The handleZipCommand method iterates over the businessesList and generates a summary of businesses by zip code. The time complexity of this method is O(n).
The handleNaicsCommand method also iterates over the businessesList and generates a summary of businesses by NAICS code. The time complexity of this method is O(n).
The handleSummaryCommand method generates a summary of all the businesses in the businessesList. The time complexity of this method is O(n).
The handleHistoryCommand method prints out the command history that is stored in the historyList. The time complexity of this method is O(n).
Overall, the worst case time complexity is O(n).
