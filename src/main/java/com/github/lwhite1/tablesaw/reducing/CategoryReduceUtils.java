package com.github.lwhite1.tablesaw.reducing;

import com.github.lwhite1.tablesaw.columns.Column;

/**
 *
 */
public interface CategoryReduceUtils extends Column, Iterable<String> {

  int size();

  default String appendAll(String lineBreak) {
    StringBuilder builder = new StringBuilder();
    int count = 0;
    for (String next : this) {
      builder.append(next);
      if (count < size() - 1) {
        builder.append(lineBreak);
        count++;
      } else {
        break;
      }
    }

    return builder.toString();
  }

  default String appendAll() {
    return appendAll(" ");
  }

}
