package com.jd.jr.service;

import com.jd.jr.request.vo.Item;
import com.jd.jr.request.vo.UserVo;

/**
 * Created by yangkuan on 15/5/22.
 */


@javax.ws.rs.Path("/service/taskExcute")
@javax.ws.rs.Consumes({"application/json"})
@javax.ws.rs.Produces({"application/json"})
public interface RestRpcServiceInterface {

    @javax.ws.rs.POST
    @javax.ws.rs.Path("/dispatch")
    public Item getItem(UserVo userVo);
}
