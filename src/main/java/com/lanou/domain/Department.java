package com.lanou.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class Department {

    private String depId; // 部门id
    private String depName; //部门名称
    private List<Post> postList = new ArrayList<Post>(); // 部门下的职务的集合

    public Department() {
    }

    public Department(String depId, String depName) {
        this.depId = depId;
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
