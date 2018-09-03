package com.design.patterns.build.builder;

/**
 * User: li.chen
 * Date: 2018-08-14 23:02
 */
public class Mainboard {
    public Mainboard(String board) {
        this.board = board;
    }

    /**
     * 主板
     */
    private String board;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }
}
