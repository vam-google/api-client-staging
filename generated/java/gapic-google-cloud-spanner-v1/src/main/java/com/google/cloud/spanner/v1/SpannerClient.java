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
package com.google.cloud.spanner.v1;

import static com.google.cloud.spanner.v1.SpannerClient.ListSessionsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.spanner.v1.stub.SpannerStub;
import com.google.cloud.spanner.v1.stub.SpannerStubSettings;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.spanner.v1.BeginTransactionRequest;
import com.google.spanner.v1.CommitRequest;
import com.google.spanner.v1.CommitResponse;
import com.google.spanner.v1.CreateSessionRequest;
import com.google.spanner.v1.DatabaseName;
import com.google.spanner.v1.DeleteSessionRequest;
import com.google.spanner.v1.ExecuteSqlRequest;
import com.google.spanner.v1.GetSessionRequest;
import com.google.spanner.v1.ListSessionsRequest;
import com.google.spanner.v1.ListSessionsResponse;
import com.google.spanner.v1.Mutation;
import com.google.spanner.v1.PartialResultSet;
import com.google.spanner.v1.ReadRequest;
import com.google.spanner.v1.ResultSet;
import com.google.spanner.v1.RollbackRequest;
import com.google.spanner.v1.Session;
import com.google.spanner.v1.SessionName;
import com.google.spanner.v1.Transaction;
import com.google.spanner.v1.TransactionOptions;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: Cloud Spanner API
 *
 * <p>The Cloud Spanner API can be used to manage sessions and execute transactions on data stored
 * in Cloud Spanner databases.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (SpannerClient spannerClient = SpannerClient.create()) {
 *   DatabaseName database = DatabaseName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]");
 *   Session response = spannerClient.createSession(database);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the spannerClient object to clean up resources such as
 * threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li> A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li> A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li> A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of SpannerSettings to create().
 * For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * SpannerSettings spannerSettings =
 *     SpannerSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * SpannerClient spannerClient =
 *     SpannerClient.create(spannerSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * SpannerSettings spannerSettings =
 *     SpannerSettings.newBuilder().setEndpoint(myEndpoint).build();
 * SpannerClient spannerClient =
 *     SpannerClient.create(spannerSettings);
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class SpannerClient implements BackgroundResource {
  private final SpannerSettings settings;
  private final SpannerStub stub;

  /** Constructs an instance of SpannerClient with default settings. */
  public static final SpannerClient create() throws IOException {
    return create(SpannerSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of SpannerClient, using the given settings. The channels are created
   * based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final SpannerClient create(SpannerSettings settings) throws IOException {
    return new SpannerClient(settings);
  }

  /**
   * Constructs an instance of SpannerClient, using the given stub for making calls. This is for
   * advanced usage - prefer to use SpannerSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final SpannerClient create(SpannerStub stub) {
    return new SpannerClient(stub);
  }

  /**
   * Constructs an instance of SpannerClient, using the given settings. This is protected so that it
   * is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected SpannerClient(SpannerSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((SpannerStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected SpannerClient(SpannerStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final SpannerSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public SpannerStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new session. A session can be used to perform transactions that read and/or modify
   * data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   * transactions.
   *
   * <p>Sessions can only execute one transaction at a time. To execute multiple concurrent
   * read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   * queries use a transaction internally, and count toward the one transaction limit.
   *
   * <p>Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   * good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   * can delete sessions for which no operations are sent for more than an hour. If a session is
   * deleted, requests to it return `NOT_FOUND`.
   *
   * <p>Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT
   * 1"`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   DatabaseName database = DatabaseName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   Session response = spannerClient.createSession(database);
   * }
   * </code></pre>
   *
   * @param database Required. The database in which the new session is created.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Session createSession(DatabaseName database) {

    CreateSessionRequest request =
        CreateSessionRequest.newBuilder().setDatabase(database.toString()).build();
    return createSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new session. A session can be used to perform transactions that read and/or modify
   * data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   * transactions.
   *
   * <p>Sessions can only execute one transaction at a time. To execute multiple concurrent
   * read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   * queries use a transaction internally, and count toward the one transaction limit.
   *
   * <p>Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   * good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   * can delete sessions for which no operations are sent for more than an hour. If a session is
   * deleted, requests to it return `NOT_FOUND`.
   *
   * <p>Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT
   * 1"`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   DatabaseName database = DatabaseName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   CreateSessionRequest request = CreateSessionRequest.newBuilder()
   *     .setDatabase(database.toString())
   *     .build();
   *   Session response = spannerClient.createSession(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final Session createSession(CreateSessionRequest request) {
    return createSessionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates a new session. A session can be used to perform transactions that read and/or modify
   * data in a Cloud Spanner database. Sessions are meant to be reused for many consecutive
   * transactions.
   *
   * <p>Sessions can only execute one transaction at a time. To execute multiple concurrent
   * read-write/write-only transactions, create multiple sessions. Note that standalone reads and
   * queries use a transaction internally, and count toward the one transaction limit.
   *
   * <p>Cloud Spanner limits the number of sessions that can exist at any given time; thus, it is a
   * good idea to delete idle and/or unneeded sessions. Aside from explicit deletes, Cloud Spanner
   * can delete sessions for which no operations are sent for more than an hour. If a session is
   * deleted, requests to it return `NOT_FOUND`.
   *
   * <p>Idle sessions can be kept alive by sending a trivial SQL query periodically, e.g., `"SELECT
   * 1"`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   DatabaseName database = DatabaseName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   CreateSessionRequest request = CreateSessionRequest.newBuilder()
   *     .setDatabase(database.toString())
   *     .build();
   *   ApiFuture&lt;Session&gt; future = spannerClient.createSessionCallable().futureCall(request);
   *   // Do something
   *   Session response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateSessionRequest, Session> createSessionCallable() {
    return stub.createSessionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   * determining whether a session is still alive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   Session response = spannerClient.getSession(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the session to retrieve.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Session getSession(SessionName name) {

    GetSessionRequest request = GetSessionRequest.newBuilder().setName(name.toString()).build();
    return getSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   * determining whether a session is still alive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   GetSessionRequest request = GetSessionRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   Session response = spannerClient.getSession(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final Session getSession(GetSessionRequest request) {
    return getSessionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Gets a session. Returns `NOT_FOUND` if the session does not exist. This is mainly useful for
   * determining whether a session is still alive.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   GetSessionRequest request = GetSessionRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Session&gt; future = spannerClient.getSessionCallable().futureCall(request);
   *   // Do something
   *   Session response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetSessionRequest, Session> getSessionCallable() {
    return stub.getSessionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all sessions in a given database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   String formattedDatabase = DatabaseName.format("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   for (Session element : spannerClient.listSessions(formattedDatabase).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param database Required. The database in which to list sessions.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionsPagedResponse listSessions(String database) {
    ListSessionsRequest request = ListSessionsRequest.newBuilder().setDatabase(database).build();
    return listSessions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all sessions in a given database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   String formattedDatabase = DatabaseName.format("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   ListSessionsRequest request = ListSessionsRequest.newBuilder()
   *     .setDatabase(formattedDatabase)
   *     .build();
   *   for (Session element : spannerClient.listSessions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSessionsPagedResponse listSessions(ListSessionsRequest request) {
    return listSessionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all sessions in a given database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   String formattedDatabase = DatabaseName.format("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   ListSessionsRequest request = ListSessionsRequest.newBuilder()
   *     .setDatabase(formattedDatabase)
   *     .build();
   *   ApiFuture&lt;ListSessionsPagedResponse&gt; future = spannerClient.listSessionsPagedCallable().futureCall(request);
   *   // Do something
   *   for (Session element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListSessionsRequest, ListSessionsPagedResponse>
      listSessionsPagedCallable() {
    return stub.listSessionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists all sessions in a given database.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   String formattedDatabase = DatabaseName.format("[PROJECT]", "[INSTANCE]", "[DATABASE]");
   *   ListSessionsRequest request = ListSessionsRequest.newBuilder()
   *     .setDatabase(formattedDatabase)
   *     .build();
   *   while (true) {
   *     ListSessionsResponse response = spannerClient.listSessionsCallable().call(request);
   *     for (Session element : response.getSessionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListSessionsRequest, ListSessionsResponse> listSessionsCallable() {
    return stub.listSessionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Ends a session, releasing server resources associated with it.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   spannerClient.deleteSession(name);
   * }
   * </code></pre>
   *
   * @param name Required. The name of the session to delete.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSession(SessionName name) {

    DeleteSessionRequest request =
        DeleteSessionRequest.newBuilder().setName(name.toString()).build();
    deleteSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Ends a session, releasing server resources associated with it.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   DeleteSessionRequest request = DeleteSessionRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   spannerClient.deleteSession(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  private final void deleteSession(DeleteSessionRequest request) {
    deleteSessionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Ends a session, releasing server resources associated with it.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName name = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   DeleteSessionRequest request = DeleteSessionRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = spannerClient.deleteSessionCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteSessionRequest, Empty> deleteSessionCallable() {
    return stub.deleteSessionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Executes an SQL query, returning all rows in a single reply. This method cannot be used to
   * return a result set larger than 10 MiB; if the query yields more data than that, the query
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Queries inside read-write transactions might return `ABORTED`. If this occurs, the
   * application should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be fetched in streaming fashion by calling
   * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String sql = "";
   *   ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setSql(sql)
   *     .build();
   *   ResultSet response = spannerClient.executeSql(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResultSet executeSql(ExecuteSqlRequest request) {
    return executeSqlCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Executes an SQL query, returning all rows in a single reply. This method cannot be used to
   * return a result set larger than 10 MiB; if the query yields more data than that, the query
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Queries inside read-write transactions might return `ABORTED`. If this occurs, the
   * application should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be fetched in streaming fashion by calling
   * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String sql = "";
   *   ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setSql(sql)
   *     .build();
   *   ApiFuture&lt;ResultSet&gt; future = spannerClient.executeSqlCallable().futureCall(request);
   *   // Do something
   *   ResultSet response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ExecuteSqlRequest, ResultSet> executeSqlCallable() {
    return stub.executeSqlCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Like [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], except returns the result set as a
   * stream. Unlike [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql], there is no limit on the
   * size of the returned result set. However, no individual row in the result set can exceed 100
   * MiB, and no column value can exceed 10 MiB.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   ApiStreamObserver&lt;PartialResultSet&gt; responseObserver =
   *       new ApiStreamObserver&lt;PartialResultSet&gt;() {
   *         {@literal @}Override
   *         public void onNext(PartialResultSet response) {
   *           // Do something when receive a response
   *         }
   *
   *         {@literal @}Override
   *         public void onError(Throwable t) {
   *           // Add error-handling
   *         }
   *
   *         {@literal @}Override
   *         public void onCompleted() {
   *           // Do something when complete.
   *         }
   *       };
   *
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String sql = "";
   *   ExecuteSqlRequest request = ExecuteSqlRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setSql(sql)
   *     .build();
   *
   *   spannerClient.executeStreamingSqlCallable().serverStreamingCall(request, responseObserver));
   * }
   * </code></pre>
   */
  public final ServerStreamingCallable<ExecuteSqlRequest, PartialResultSet>
      executeStreamingSqlCallable() {
    return stub.executeStreamingSqlCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Reads rows from the database using key lookups and scans, as a simple key/value style
   * alternative to [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql]. This method cannot be used
   * to return a result set larger than 10 MiB; if the read matches more data than that, the read
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Reads inside read-write transactions might return `ABORTED`. If this occurs, the application
   * should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be yielded in streaming fashion by calling
   * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String table = "";
   *   List&lt;String&gt; columns = new ArrayList&lt;&gt;();
   *   KeySet keySet = KeySet.newBuilder().build();
   *   ReadRequest request = ReadRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setTable(table)
   *     .addAllColumns(columns)
   *     .setKeySet(keySet)
   *     .build();
   *   ResultSet response = spannerClient.read(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ResultSet read(ReadRequest request) {
    return readCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Reads rows from the database using key lookups and scans, as a simple key/value style
   * alternative to [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql]. This method cannot be used
   * to return a result set larger than 10 MiB; if the read matches more data than that, the read
   * fails with a `FAILED_PRECONDITION` error.
   *
   * <p>Reads inside read-write transactions might return `ABORTED`. If this occurs, the application
   * should restart the transaction from the beginning. See
   * [Transaction][google.spanner.v1.Transaction] for more details.
   *
   * <p>Larger result sets can be yielded in streaming fashion by calling
   * [StreamingRead][google.spanner.v1.Spanner.StreamingRead] instead.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String table = "";
   *   List&lt;String&gt; columns = new ArrayList&lt;&gt;();
   *   KeySet keySet = KeySet.newBuilder().build();
   *   ReadRequest request = ReadRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setTable(table)
   *     .addAllColumns(columns)
   *     .setKeySet(keySet)
   *     .build();
   *   ApiFuture&lt;ResultSet&gt; future = spannerClient.readCallable().futureCall(request);
   *   // Do something
   *   ResultSet response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<ReadRequest, ResultSet> readCallable() {
    return stub.readCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Like [Read][google.spanner.v1.Spanner.Read], except returns the result set as a stream. Unlike
   * [Read][google.spanner.v1.Spanner.Read], there is no limit on the size of the returned result
   * set. However, no individual row in the result set can exceed 100 MiB, and no column value can
   * exceed 10 MiB.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   ApiStreamObserver&lt;PartialResultSet&gt; responseObserver =
   *       new ApiStreamObserver&lt;PartialResultSet&gt;() {
   *         {@literal @}Override
   *         public void onNext(PartialResultSet response) {
   *           // Do something when receive a response
   *         }
   *
   *         {@literal @}Override
   *         public void onError(Throwable t) {
   *           // Add error-handling
   *         }
   *
   *         {@literal @}Override
   *         public void onCompleted() {
   *           // Do something when complete.
   *         }
   *       };
   *
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   String table = "";
   *   List&lt;String&gt; columns = new ArrayList&lt;&gt;();
   *   KeySet keySet = KeySet.newBuilder().build();
   *   ReadRequest request = ReadRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setTable(table)
   *     .addAllColumns(columns)
   *     .setKeySet(keySet)
   *     .build();
   *
   *   spannerClient.streamingReadCallable().serverStreamingCall(request, responseObserver));
   * }
   * </code></pre>
   */
  public final ServerStreamingCallable<ReadRequest, PartialResultSet> streamingReadCallable() {
    return stub.streamingReadCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Begins a new transaction. This step can often be skipped:
   * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions options = TransactionOptions.newBuilder().build();
   *   Transaction response = spannerClient.beginTransaction(session, options);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction runs.
   * @param options Required. Options for the new transaction.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Transaction beginTransaction(SessionName session, TransactionOptions options) {

    BeginTransactionRequest request =
        BeginTransactionRequest.newBuilder()
            .setSession(session.toString())
            .setOptions(options)
            .build();
    return beginTransaction(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Begins a new transaction. This step can often be skipped:
   * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions options = TransactionOptions.newBuilder().build();
   *   BeginTransactionRequest request = BeginTransactionRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setOptions(options)
   *     .build();
   *   Transaction response = spannerClient.beginTransaction(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Transaction beginTransaction(BeginTransactionRequest request) {
    return beginTransactionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Begins a new transaction. This step can often be skipped:
   * [Read][google.spanner.v1.Spanner.Read], [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] and
   * [Commit][google.spanner.v1.Spanner.Commit] can begin a new transaction as a side-effect.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions options = TransactionOptions.newBuilder().build();
   *   BeginTransactionRequest request = BeginTransactionRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setOptions(options)
   *     .build();
   *   ApiFuture&lt;Transaction&gt; future = spannerClient.beginTransactionCallable().futureCall(request);
   *   // Do something
   *   Transaction response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<BeginTransactionRequest, Transaction> beginTransactionCallable() {
    return stub.beginTransactionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitResponse response = spannerClient.commit(session, transactionId, mutations);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction to be committed is running.
   * @param transactionId Commit a previously-started transaction.
   * @param mutations The mutations to be executed when this transaction commits. All mutations are
   *     applied atomically, in the order they appear in this list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CommitResponse commit(
      SessionName session, ByteString transactionId, List<Mutation> mutations) {

    CommitRequest request =
        CommitRequest.newBuilder()
            .setSession(session.toString())
            .setTransactionId(transactionId)
            .addAllMutations(mutations)
            .build();
    return commit(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   TransactionOptions singleUseTransaction = TransactionOptions.newBuilder().build();
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitResponse response = spannerClient.commit(session, singleUseTransaction, mutations);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction to be committed is running.
   * @param singleUseTransaction Execute mutations in a temporary transaction. Note that unlike
   *     commit of a previously-started transaction, commit with a temporary transaction is
   *     non-idempotent. That is, if the `CommitRequest` is sent to Cloud Spanner more than once
   *     (for instance, due to retries in the application, or in the transport library), it is
   *     possible that the mutations are executed more than once. If this is undesirable, use
   *     [BeginTransaction][google.spanner.v1.Spanner.BeginTransaction] and
   *     [Commit][google.spanner.v1.Spanner.Commit] instead.
   * @param mutations The mutations to be executed when this transaction commits. All mutations are
   *     applied atomically, in the order they appear in this list.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CommitResponse commit(
      SessionName session, TransactionOptions singleUseTransaction, List<Mutation> mutations) {

    CommitRequest request =
        CommitRequest.newBuilder()
            .setSession(session.toString())
            .setSingleUseTransaction(singleUseTransaction)
            .addAllMutations(mutations)
            .build();
    return commit(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitRequest request = CommitRequest.newBuilder()
   *     .setSession(session.toString())
   *     .addAllMutations(mutations)
   *     .build();
   *   CommitResponse response = spannerClient.commit(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CommitResponse commit(CommitRequest request) {
    return commitCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Commits a transaction. The request includes the mutations to be applied to rows in the
   * database.
   *
   * <p>`Commit` might return an `ABORTED` error. This can occur at any time; commonly, the cause is
   * conflicts with concurrent transactions. However, it can also happen for a variety of other
   * reasons. If `Commit` returns `ABORTED`, the caller should re-attempt the transaction from the
   * beginning, re-using the same session.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   List&lt;Mutation&gt; mutations = new ArrayList&lt;&gt;();
   *   CommitRequest request = CommitRequest.newBuilder()
   *     .setSession(session.toString())
   *     .addAllMutations(mutations)
   *     .build();
   *   ApiFuture&lt;CommitResponse&gt; future = spannerClient.commitCallable().futureCall(request);
   *   // Do something
   *   CommitResponse response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CommitRequest, CommitResponse> commitCallable() {
    return stub.commitCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   * transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   * commit.
   *
   * <p>`Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   * already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   spannerClient.rollback(session, transactionId);
   * }
   * </code></pre>
   *
   * @param session Required. The session in which the transaction to roll back is running.
   * @param transactionId Required. The transaction to roll back.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void rollback(SessionName session, ByteString transactionId) {

    RollbackRequest request =
        RollbackRequest.newBuilder()
            .setSession(session.toString())
            .setTransactionId(transactionId)
            .build();
    rollback(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   * transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   * commit.
   *
   * <p>`Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   * already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   RollbackRequest request = RollbackRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setTransactionId(transactionId)
   *     .build();
   *   spannerClient.rollback(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void rollback(RollbackRequest request) {
    rollbackCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Rolls back a transaction, releasing any locks it holds. It is a good idea to call this for any
   * transaction that includes one or more [Read][google.spanner.v1.Spanner.Read] or
   * [ExecuteSql][google.spanner.v1.Spanner.ExecuteSql] requests and ultimately decides not to
   * commit.
   *
   * <p>`Rollback` returns `OK` if it successfully aborts the transaction, the transaction was
   * already aborted, or the transaction is not found. `Rollback` never returns `ABORTED`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (SpannerClient spannerClient = SpannerClient.create()) {
   *   SessionName session = SessionName.of("[PROJECT]", "[INSTANCE]", "[DATABASE]", "[SESSION]");
   *   ByteString transactionId = ByteString.copyFromUtf8("");
   *   RollbackRequest request = RollbackRequest.newBuilder()
   *     .setSession(session.toString())
   *     .setTransactionId(transactionId)
   *     .build();
   *   ApiFuture&lt;Void&gt; future = spannerClient.rollbackCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<RollbackRequest, Empty> rollbackCallable() {
    return stub.rollbackCallable();
  }

  @Override
  public final void close() throws Exception {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListSessionsPagedResponse
      extends AbstractPagedListResponse<
          ListSessionsRequest, ListSessionsResponse, Session, ListSessionsPage,
          ListSessionsFixedSizeCollection> {

    public static ApiFuture<ListSessionsPagedResponse> createAsync(
        PageContext<ListSessionsRequest, ListSessionsResponse, Session> context,
        ApiFuture<ListSessionsResponse> futureResponse) {
      ApiFuture<ListSessionsPage> futurePage =
          ListSessionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListSessionsPage, ListSessionsPagedResponse>() {
            @Override
            public ListSessionsPagedResponse apply(ListSessionsPage input) {
              return new ListSessionsPagedResponse(input);
            }
          });
    }

    private ListSessionsPagedResponse(ListSessionsPage page) {
      super(page, ListSessionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSessionsPage
      extends AbstractPage<ListSessionsRequest, ListSessionsResponse, Session, ListSessionsPage> {

    private ListSessionsPage(
        PageContext<ListSessionsRequest, ListSessionsResponse, Session> context,
        ListSessionsResponse response) {
      super(context, response);
    }

    private static ListSessionsPage createEmptyPage() {
      return new ListSessionsPage(null, null);
    }

    @Override
    protected ListSessionsPage createPage(
        PageContext<ListSessionsRequest, ListSessionsResponse, Session> context,
        ListSessionsResponse response) {
      return new ListSessionsPage(context, response);
    }

    @Override
    public ApiFuture<ListSessionsPage> createPageAsync(
        PageContext<ListSessionsRequest, ListSessionsResponse, Session> context,
        ApiFuture<ListSessionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSessionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSessionsRequest, ListSessionsResponse, Session, ListSessionsPage,
          ListSessionsFixedSizeCollection> {

    private ListSessionsFixedSizeCollection(List<ListSessionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSessionsFixedSizeCollection createEmptyCollection() {
      return new ListSessionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSessionsFixedSizeCollection createCollection(
        List<ListSessionsPage> pages, int collectionSize) {
      return new ListSessionsFixedSizeCollection(pages, collectionSize);
    }
  }
}
