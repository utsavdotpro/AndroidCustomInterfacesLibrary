package com.isolpro.custom;

import java.util.ArrayList;
import java.util.List;

public abstract class ListFilter<T> {

  private final Callback<List<T>> onFilterChanged;
  private List<T> items, filteredItems;

  public ListFilter(Callback<List<T>> onFilterChanged) {
    this.onFilterChanged = onFilterChanged;
  }

  public void setItems(List<T> items) {
    this.items = items;

    notifyFilterChanged();
  }

  protected abstract boolean compare(T item);

  public void clearFilters() {
    notifyFilterChanged();
  }

  private void filter() {
    filteredItems = new ArrayList<>();

    if (items == null) return;

    for (T item : items) {
      if (compare(item))
        filteredItems.add(item);
    }
  }

  protected void notifyFilterChanged() {
    filter();

    if (onFilterChanged != null)
      onFilterChanged.exec(filteredItems);
  }

  public List<T> getItems() {
    return items;
  }

  public List<T> getFilteredItems() {
    return filteredItems;
  }
}
