/**
 * Copyright (c) 2022, Samsung Research. All rights reserved.
 *
 * Use of this source code is governed by a MIT license that can be
 * found in the LICENSE file.
 */

package com.lpvs.entity.config;

import com.lpvs.entity.enums.PullRequestAction;

import java.util.Date;

public class WebhookConfig {
    Long webhookId;
    PullRequestAction action;
    Long repositoryId;
    String repositoryName;
    String repositoryOrganization;
    String repositoryUrl;
    String repositoryLicense;
    String headCommitSHA;
    String pullRequestUrl;
    String pullRequestFilesUrl;
    String pullRequestAPIUrl;
    Long pullRequestId;
    String pullRequestName;
    String userId;
    String hubLink;
    String branch;
    String pullRequestBranch;
    int attempts;
    Date date;
    String reviewSystemType;
    String reviewSystemName;
    String statusCallbackUrl;

    public WebhookConfig() {
    }

    public Long getWebhookId() {
        return webhookId;
    }

    public void setWebhookId(Long webhookId) {
        this.webhookId = webhookId;
    }

    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getPullRequestId() {
        return pullRequestId;
    }

    public void setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public String getPullRequestName() {
        return pullRequestName;
    }

    public void setPullRequestName(String pullRequestName) {
        this.pullRequestName = pullRequestName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRepositoryLicense() {
        return repositoryLicense;
    }

    public void setRepositoryLicense(String repositoryLicense) {
        this.repositoryLicense = repositoryLicense;
    }

    public String getHubLink() {
        return hubLink;
    }

    public void setHubLink(String hubLink) {
        this.hubLink = hubLink;
    }

    public String getRepositoryOrganization() {
        return repositoryOrganization;
    }

    public void setRepositoryOrganization(String repositoryOrganization) {
        this.repositoryOrganization = repositoryOrganization;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getHeadCommitSHA() { return headCommitSHA; }

    public void setHeadCommitSHA(String headCommitSHA) { this.headCommitSHA = headCommitSHA; }

    public PullRequestAction getAction() {
        return action;
    }

    public void setAction(PullRequestAction action) {
        this.action = action;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(String pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public String getPullRequestFilesUrl() {
        return pullRequestFilesUrl;
    }

    public void setPullRequestFilesUrl(String pullRequestFilesUrl) {
        this.pullRequestFilesUrl = pullRequestFilesUrl;
    }

    public String getPullRequestAPIUrl() {
        return pullRequestAPIUrl;
    }

    public void setPullRequestAPIUrl(String pullRequestAPIUrl) {
        this.pullRequestAPIUrl = pullRequestAPIUrl;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public String getPullRequestBranch() {
        return pullRequestBranch;
    }

    public void setPullRequestBranch(String pullRequestBranch) {
        this.pullRequestBranch = pullRequestBranch;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReviewSystemType() {
        return reviewSystemType;
    }

    public void setReviewSystemType(String reviewSystemType) {
        this.reviewSystemType = reviewSystemType;
    }

    public String getReviewSystemName() {
        return reviewSystemName;
    }

    public void setReviewSystemName(String reviewSystemName) {
        this.reviewSystemName = reviewSystemName;
    }

    public String getStatusCallbackUrl() {
        return statusCallbackUrl;
    }

    public void setStatusCallbackUrl(String statusCallbackUrl) {
        this.statusCallbackUrl = statusCallbackUrl;
    }

    @Override
    public String toString(){
        return "WebhookConfig [action = " + getAction() + "; organization name = " + getRepositoryOrganization() +
                "; repository name = " + getRepositoryName() + "; PR URL = " + getPullRequestUrl() +
                "; commit = " + getHeadCommitSHA() + "]";
    }
}
