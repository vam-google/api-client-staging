/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dlp.v2beta2;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.dlp.v2beta2.stub.DlpServiceStubSettings;
import com.google.privacy.dlp.v2beta2.AnalyzeDataSourceRiskRequest;
import com.google.privacy.dlp.v2beta2.CancelDlpJobRequest;
import com.google.privacy.dlp.v2beta2.CreateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.CreateInspectTemplateRequest;
import com.google.privacy.dlp.v2beta2.DeidentifyContentRequest;
import com.google.privacy.dlp.v2beta2.DeidentifyContentResponse;
import com.google.privacy.dlp.v2beta2.DeidentifyTemplate;
import com.google.privacy.dlp.v2beta2.DeleteDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.DeleteDlpJobRequest;
import com.google.privacy.dlp.v2beta2.DeleteInspectTemplateRequest;
import com.google.privacy.dlp.v2beta2.DlpJob;
import com.google.privacy.dlp.v2beta2.GetDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.GetDlpJobRequest;
import com.google.privacy.dlp.v2beta2.GetInspectTemplateRequest;
import com.google.privacy.dlp.v2beta2.InspectContentRequest;
import com.google.privacy.dlp.v2beta2.InspectContentResponse;
import com.google.privacy.dlp.v2beta2.InspectDataSourceRequest;
import com.google.privacy.dlp.v2beta2.InspectTemplate;
import com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesRequest;
import com.google.privacy.dlp.v2beta2.ListDeidentifyTemplatesResponse;
import com.google.privacy.dlp.v2beta2.ListDlpJobsRequest;
import com.google.privacy.dlp.v2beta2.ListDlpJobsResponse;
import com.google.privacy.dlp.v2beta2.ListInfoTypesRequest;
import com.google.privacy.dlp.v2beta2.ListInfoTypesResponse;
import com.google.privacy.dlp.v2beta2.ListInspectTemplatesRequest;
import com.google.privacy.dlp.v2beta2.ListInspectTemplatesResponse;
import com.google.privacy.dlp.v2beta2.RedactImageRequest;
import com.google.privacy.dlp.v2beta2.RedactImageResponse;
import com.google.privacy.dlp.v2beta2.ReidentifyContentRequest;
import com.google.privacy.dlp.v2beta2.ReidentifyContentResponse;
import com.google.privacy.dlp.v2beta2.UpdateDeidentifyTemplateRequest;
import com.google.privacy.dlp.v2beta2.UpdateInspectTemplateRequest;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link DlpServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (dlp.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of inspectContent to 30 seconds:
 *
 * <pre>
 * <code>
 * DlpServiceSettings.Builder dlpServiceSettingsBuilder =
 *     DlpServiceSettings.newBuilder();
 * dlpServiceSettingsBuilder.inspectContentSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * DlpServiceSettings dlpServiceSettings = dlpServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class DlpServiceSettings extends ClientSettings<DlpServiceSettings> {
  /** Returns the object with the settings used for calls to inspectContent. */
  public UnaryCallSettings<InspectContentRequest, InspectContentResponse> inspectContentSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).inspectContentSettings();
  }

  /** Returns the object with the settings used for calls to redactImage. */
  public UnaryCallSettings<RedactImageRequest, RedactImageResponse> redactImageSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).redactImageSettings();
  }

  /** Returns the object with the settings used for calls to deidentifyContent. */
  public UnaryCallSettings<DeidentifyContentRequest, DeidentifyContentResponse>
      deidentifyContentSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deidentifyContentSettings();
  }

  /** Returns the object with the settings used for calls to reidentifyContent. */
  public UnaryCallSettings<ReidentifyContentRequest, ReidentifyContentResponse>
      reidentifyContentSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).reidentifyContentSettings();
  }

  /** Returns the object with the settings used for calls to inspectDataSource. */
  public UnaryCallSettings<InspectDataSourceRequest, DlpJob> inspectDataSourceSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).inspectDataSourceSettings();
  }

  /** Returns the object with the settings used for calls to analyzeDataSourceRisk. */
  public UnaryCallSettings<AnalyzeDataSourceRiskRequest, DlpJob> analyzeDataSourceRiskSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).analyzeDataSourceRiskSettings();
  }

  /** Returns the object with the settings used for calls to listInfoTypes. */
  public UnaryCallSettings<ListInfoTypesRequest, ListInfoTypesResponse> listInfoTypesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listInfoTypesSettings();
  }

  /** Returns the object with the settings used for calls to createInspectTemplate. */
  public UnaryCallSettings<CreateInspectTemplateRequest, InspectTemplate>
      createInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to updateInspectTemplate. */
  public UnaryCallSettings<UpdateInspectTemplateRequest, InspectTemplate>
      updateInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to getInspectTemplate. */
  public UnaryCallSettings<GetInspectTemplateRequest, InspectTemplate>
      getInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to listInspectTemplates. */
  public PagedCallSettings<
          ListInspectTemplatesRequest, ListInspectTemplatesResponse,
          ListInspectTemplatesPagedResponse>
      listInspectTemplatesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listInspectTemplatesSettings();
  }

  /** Returns the object with the settings used for calls to deleteInspectTemplate. */
  public UnaryCallSettings<DeleteInspectTemplateRequest, Empty> deleteInspectTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteInspectTemplateSettings();
  }

  /** Returns the object with the settings used for calls to createDeidentifyTemplate. */
  public UnaryCallSettings<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
      createDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).createDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to updateDeidentifyTemplate. */
  public UnaryCallSettings<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
      updateDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).updateDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to getDeidentifyTemplate. */
  public UnaryCallSettings<GetDeidentifyTemplateRequest, DeidentifyTemplate>
      getDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to listDeidentifyTemplates. */
  public PagedCallSettings<
          ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse,
          ListDeidentifyTemplatesPagedResponse>
      listDeidentifyTemplatesSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listDeidentifyTemplatesSettings();
  }

  /** Returns the object with the settings used for calls to deleteDeidentifyTemplate. */
  public UnaryCallSettings<DeleteDeidentifyTemplateRequest, Empty>
      deleteDeidentifyTemplateSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteDeidentifyTemplateSettings();
  }

  /** Returns the object with the settings used for calls to listDlpJobs. */
  public PagedCallSettings<ListDlpJobsRequest, ListDlpJobsResponse, ListDlpJobsPagedResponse>
      listDlpJobsSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).listDlpJobsSettings();
  }

  /** Returns the object with the settings used for calls to getDlpJob. */
  public UnaryCallSettings<GetDlpJobRequest, DlpJob> getDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).getDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to deleteDlpJob. */
  public UnaryCallSettings<DeleteDlpJobRequest, Empty> deleteDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).deleteDlpJobSettings();
  }

  /** Returns the object with the settings used for calls to cancelDlpJob. */
  public UnaryCallSettings<CancelDlpJobRequest, Empty> cancelDlpJobSettings() {
    return ((DlpServiceStubSettings) getStubSettings()).cancelDlpJobSettings();
  }

  public static final DlpServiceSettings create(DlpServiceStubSettings stub) throws IOException {
    return new DlpServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return DlpServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return DlpServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DlpServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return DlpServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return DlpServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return DlpServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return DlpServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected DlpServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for DlpServiceSettings. */
  public static class Builder extends ClientSettings.Builder<DlpServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(DlpServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(DlpServiceStubSettings.newBuilder());
    }

    protected Builder(DlpServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(DlpServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public DlpServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((DlpServiceStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to inspectContent. */
    public UnaryCallSettings.Builder<InspectContentRequest, InspectContentResponse>
        inspectContentSettings() {
      return getStubSettingsBuilder().inspectContentSettings();
    }

    /** Returns the builder for the settings used for calls to redactImage. */
    public UnaryCallSettings.Builder<RedactImageRequest, RedactImageResponse>
        redactImageSettings() {
      return getStubSettingsBuilder().redactImageSettings();
    }

    /** Returns the builder for the settings used for calls to deidentifyContent. */
    public UnaryCallSettings.Builder<DeidentifyContentRequest, DeidentifyContentResponse>
        deidentifyContentSettings() {
      return getStubSettingsBuilder().deidentifyContentSettings();
    }

    /** Returns the builder for the settings used for calls to reidentifyContent. */
    public UnaryCallSettings.Builder<ReidentifyContentRequest, ReidentifyContentResponse>
        reidentifyContentSettings() {
      return getStubSettingsBuilder().reidentifyContentSettings();
    }

    /** Returns the builder for the settings used for calls to inspectDataSource. */
    public UnaryCallSettings.Builder<InspectDataSourceRequest, DlpJob> inspectDataSourceSettings() {
      return getStubSettingsBuilder().inspectDataSourceSettings();
    }

    /** Returns the builder for the settings used for calls to analyzeDataSourceRisk. */
    public UnaryCallSettings.Builder<AnalyzeDataSourceRiskRequest, DlpJob>
        analyzeDataSourceRiskSettings() {
      return getStubSettingsBuilder().analyzeDataSourceRiskSettings();
    }

    /** Returns the builder for the settings used for calls to listInfoTypes. */
    public UnaryCallSettings.Builder<ListInfoTypesRequest, ListInfoTypesResponse>
        listInfoTypesSettings() {
      return getStubSettingsBuilder().listInfoTypesSettings();
    }

    /** Returns the builder for the settings used for calls to createInspectTemplate. */
    public UnaryCallSettings.Builder<CreateInspectTemplateRequest, InspectTemplate>
        createInspectTemplateSettings() {
      return getStubSettingsBuilder().createInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to updateInspectTemplate. */
    public UnaryCallSettings.Builder<UpdateInspectTemplateRequest, InspectTemplate>
        updateInspectTemplateSettings() {
      return getStubSettingsBuilder().updateInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to getInspectTemplate. */
    public UnaryCallSettings.Builder<GetInspectTemplateRequest, InspectTemplate>
        getInspectTemplateSettings() {
      return getStubSettingsBuilder().getInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to listInspectTemplates. */
    public PagedCallSettings.Builder<
            ListInspectTemplatesRequest, ListInspectTemplatesResponse,
            ListInspectTemplatesPagedResponse>
        listInspectTemplatesSettings() {
      return getStubSettingsBuilder().listInspectTemplatesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteInspectTemplate. */
    public UnaryCallSettings.Builder<DeleteInspectTemplateRequest, Empty>
        deleteInspectTemplateSettings() {
      return getStubSettingsBuilder().deleteInspectTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to createDeidentifyTemplate. */
    public UnaryCallSettings.Builder<CreateDeidentifyTemplateRequest, DeidentifyTemplate>
        createDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().createDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to updateDeidentifyTemplate. */
    public UnaryCallSettings.Builder<UpdateDeidentifyTemplateRequest, DeidentifyTemplate>
        updateDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().updateDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to getDeidentifyTemplate. */
    public UnaryCallSettings.Builder<GetDeidentifyTemplateRequest, DeidentifyTemplate>
        getDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().getDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to listDeidentifyTemplates. */
    public PagedCallSettings.Builder<
            ListDeidentifyTemplatesRequest, ListDeidentifyTemplatesResponse,
            ListDeidentifyTemplatesPagedResponse>
        listDeidentifyTemplatesSettings() {
      return getStubSettingsBuilder().listDeidentifyTemplatesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDeidentifyTemplate. */
    public UnaryCallSettings.Builder<DeleteDeidentifyTemplateRequest, Empty>
        deleteDeidentifyTemplateSettings() {
      return getStubSettingsBuilder().deleteDeidentifyTemplateSettings();
    }

    /** Returns the builder for the settings used for calls to listDlpJobs. */
    public PagedCallSettings.Builder<
            ListDlpJobsRequest, ListDlpJobsResponse, ListDlpJobsPagedResponse>
        listDlpJobsSettings() {
      return getStubSettingsBuilder().listDlpJobsSettings();
    }

    /** Returns the builder for the settings used for calls to getDlpJob. */
    public UnaryCallSettings.Builder<GetDlpJobRequest, DlpJob> getDlpJobSettings() {
      return getStubSettingsBuilder().getDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to deleteDlpJob. */
    public UnaryCallSettings.Builder<DeleteDlpJobRequest, Empty> deleteDlpJobSettings() {
      return getStubSettingsBuilder().deleteDlpJobSettings();
    }

    /** Returns the builder for the settings used for calls to cancelDlpJob. */
    public UnaryCallSettings.Builder<CancelDlpJobRequest, Empty> cancelDlpJobSettings() {
      return getStubSettingsBuilder().cancelDlpJobSettings();
    }

    @Override
    public DlpServiceSettings build() throws IOException {
      return new DlpServiceSettings(this);
    }
  }
}
