/*
 * Copyright (c) 2016 Cosmin Stejerean
 *
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.offbytwo.datatables.models;


import java.util.ArrayList;
import java.util.List;

public class DTRequest {
    /**
     * Draw counter. This is used by DataTables to ensure that the Ajax returns from server-side processing requests
     * are drawn in sequence by DataTables (Ajax requests are asynchronous and thus can return out of sequence).
     */
    private Integer draw = 0;

    /**
     * Paging first record indicator. This is the start point in the current data set
     * (0 index based - i.e. 0 is the first record).
     */
    private Integer start = 0;

    /**
     * Number of records that the table can display in the current draw. It is expected that the number of records
     * returned will be equal to this number, unless the server has fewer records to return. Note that this can be -1
     * to indicate that all records should be returned (although that negates any benefits of server-side processing!)
     */
    private Integer length = 100;

    /**
     * Global search. To be applied to all columns which have searchable as true.
     *
     * @see com.offbytwo.datatables.models.DTSearch
     */
    private DTSearch search = new DTSearch();


    /**
     * Columns to which ordering should be applied.
     *
     * @see com.offbytwo.datatables.models.DTOrdering
     */
    private List<DTOrdering> order = new ArrayList<DTOrdering>();


    /**
     * Columns which should be returned by the request.
     *
     * @see com.offbytwo.datatables.models.DTColumn
     */
    private List<DTColumn> columns = new ArrayList<DTColumn>();


    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public DTSearch getSearch() {
        return search;
    }

    public void setSearch(DTSearch search) {
        this.search = search;
    }

    public List<DTOrdering> getOrder() {
        return order;
    }

    public void setOrder(List<DTOrdering> order) {
        this.order = order;
    }

    public List<DTColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DTColumn> columns) {
        this.columns = columns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DTRequest dtRequest = (DTRequest) o;

        if (!draw.equals(dtRequest.draw)) return false;
        if (!start.equals(dtRequest.start)) return false;
        if (!length.equals(dtRequest.length)) return false;
        if (!search.equals(dtRequest.search)) return false;
        if (!order.equals(dtRequest.order)) return false;
        return columns.equals(dtRequest.columns);

    }

    @Override
    public int hashCode() {
        int result = draw.hashCode();
        result = 31 * result + start.hashCode();
        result = 31 * result + length.hashCode();
        result = 31 * result + search.hashCode();
        result = 31 * result + order.hashCode();
        result = 31 * result + columns.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "DTRequest{" +
                "draw=" + draw +
                ", start=" + start +
                ", length=" + length +
                ", search=" + search +
                ", order=" + order +
                ", columns=" + columns +
                '}';
    }
}
