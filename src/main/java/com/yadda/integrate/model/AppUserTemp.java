package com.yadda.integrate.model;

import java.util.Date;

public class AppUserTemp extends RootModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_AppUserTemp.FId
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    private Integer fid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_AppUserTemp.FNumber
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    private String fnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_AppUserTemp.FCreateTime
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    private Date fcreatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_AppUserTemp.FScene
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    private String fscene;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_AppUserTemp.FId
     *
     * @return the value of t_AppUserTemp.FId
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_AppUserTemp.FId
     *
     * @param fid the value for t_AppUserTemp.FId
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_AppUserTemp.FNumber
     *
     * @return the value of t_AppUserTemp.FNumber
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public String getFnumber() {
        return fnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_AppUserTemp.FNumber
     *
     * @param fnumber the value for t_AppUserTemp.FNumber
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public void setFnumber(String fnumber) {
        this.fnumber = fnumber == null ? null : fnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_AppUserTemp.FCreateTime
     *
     * @return the value of t_AppUserTemp.FCreateTime
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public Date getFcreatetime() {
        return fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_AppUserTemp.FCreateTime
     *
     * @param fcreatetime the value for t_AppUserTemp.FCreateTime
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public void setFcreatetime(Date fcreatetime) {
        this.fcreatetime = fcreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_AppUserTemp.FScene
     *
     * @return the value of t_AppUserTemp.FScene
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public String getFscene() {
        return fscene;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_AppUserTemp.FScene
     *
     * @param fscene the value for t_AppUserTemp.FScene
     *
     * @mbg.generated Tue Oct 11 12:42:32 CST 2016
     */
    public void setFscene(String fscene) {
        this.fscene = fscene == null ? null : fscene.trim();
    }
}