package com.solo.erp.dao.model;

import java.io.Serializable;

public class ErpUidSequence implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_uid_sequence.id
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column erp_uid_sequence.id_name
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    private String idName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table erp_uid_sequence
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_uid_sequence.id
     *
     * @return the value of erp_uid_sequence.id
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_uid_sequence.id
     *
     * @param id the value for erp_uid_sequence.id
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column erp_uid_sequence.id_name
     *
     * @return the value of erp_uid_sequence.id_name
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    public String getIdName() {
        return idName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column erp_uid_sequence.id_name
     *
     * @param idName the value for erp_uid_sequence.id_name
     *
     * @mbg.generated Wed Jul 11 11:10:21 CST 2018
     */
    public void setIdName(String idName) {
        this.idName = idName == null ? null : idName.trim();
    }
}